## STEP C
- Prompt 
> Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.

- File name 
> mainscreen.html

- Line number
> 14 - 302

- Change 
> I restructured the HTML that was provided so that I could implement internal CSS using a style tag. This included CSS for the header, footer, main content, body, buttons, images, and tables. I then added a header tag so that I could give the site more structure and color. Using what I learned in D276 regarding semantic elements, I changed the structure of the div tag so use main and added two sections. One for engine parts and one for maintenance products. Using the internal CSS I wrote, I changed the classes for the buttons, tables, and containers. I also repositioned the main content so that I could add two images to the site with text under them. Finally, I added a footer to keep with proper semantic style and give it more visual structure.

## STEP D
- Prompt
> Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.

- File name
> AboutController.java

- Line number
> 1 - 13

- Change
> I added an AboutController to the controllers directory so that spring boot could properly navigate the the AboutPage.html. The controller includes imports for the spring boot framework and the controllers package. The controller itself simply maps to the /about endpoint and returns the AboutPage.html.

- File name
> AboutPage.html

- Line number
> 1 - 258

- Change
> The AboutPage.html was built by me from scratch. I ended up reusing some of the internal CSS that I wrote in mainscreen.html so that I could keep the same theme and style across both pages. I added a few extra style classes so that I could reposition the div as this page does not contain images whereas mainscreen does. I also added style classes for the table that is used in the AboutPage that displays the would be parts and products that the site would offer. Finally, I edited the footer to include a "Contact Us" section instead of "About Us" as it would be redundant.

- File name
> mainscreen.html

- Line number
> 193 - 201

- Change
> I added new style classes for the About Us footer. The style changes change the font color, remove the default blue highlighting for hyperlinks and also add a slight color variation on mouse hovering.

- Line number
> 308

- Change
> I removed the previous p tag I had that contained text and replaced it with an a tag so I could link to the AboutPage using the /about endpoint. This is used in conjunction with the AboutController.java that I created so that site visitors could navigate to the AboutPage using the link without having to type in the endpoint manually in the url.

## STEP E
- Prompt
> Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.

- File Name
> BootStrapData.java

- Line Number
> 55 - 147

- Changes
> I created 5 inHousePart objects, each with their own name, inventory count, price, and ID. As well as 5 OutSourcedPart objects with their own name, inventory count, price, and ID. These 10 objects are wrapped in an in statement that checks the count of the partRepository. The reason for this if statement is to prevent the addition of duplicate items when the project is relaunched.

- Line Number
> 161 - 174

- Changes
> I created 5 product objects, each with their own name, price, and inventory count. For these product objects I used the Product class that consists of name, price, and inv and not the one that consist of id, name, price, and inv. These 5 objects were wrapped in an if statement that checks the count of the productRepository. The reason for this if statement is to prevent the addition of duplicate products when the project is relaunched.

- File Name
> application.properties

- Line Number
> 6

- Changes
> I updated line number 6 because I needed to update the DB source.I created a new DB ending in "dbLoutchenok_3". The reason for this change was so I could initialize a new DB that would be created with my new products and parts.

## STEP F
- Prompt
>  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters: The “Buy Now” button must be next to the buttons that update and delete products.

- File Name
> mainscreen.html

- Line Number
> 292

- Changes
> I added a new button in the table that previously contained the "Update" and "Delete" buttons. The new button that was added is titled "Buy Now" and it is linked to the /buyProduct endpoint. When the button is clicked, it will send the respective product id to the /buyProduct endpoint.

- Prompt
>  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters: The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.

- File Name
> AddProductController.java

- Line Number
> 181 - 206

- Changes
> I created a new method titled "buyProduct" that is called when the frontend buy now button is clicked and sents a request to /buyProduct. When called, this method will assign the proper product id and then using the provided ID, we create a variable that will store the current inventory count of that item ID. Thent he method enters a for-loop, this for-loop checks the inventory count variable. If the inventory is equal to 0 we return a failure page to the user. If the inventory is NOT equal to 0 we redirect the user to a success page. In the case that the item inv is not equal to 0, before we redirect the user to a success page, we first update the item inventory. Since the user is purchasing an item, we first update out inv count variable to decrease by 1, we then update our item id inventory, and finally, we save the new item id inventory count to the DB.

- Prompt
>  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters: TDisplay a message that indicates the success or failure of a purchase.

- File Name
> Failure.html

- Line Number
> 1 - 12

- Changes
> I created a new html page that serves as a failure alert for the user. The page has a title and text that lets the user know that the purchase failed. And it also has a hyperlink that redirects the user back to the mainscreen.

- Prompt
>  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters: TDisplay a message that indicates the success or failure of a purchase.

- File Name
> Success.html

- Line Number
> 1 - 12

- Changes
> I created a new html page that serves as a success alert for the user. The page has a title and tet that lets the user know that the purchase was successful. The page also contains a hyperlink that will redirect the user back to mainscreen.

## STEP G
- Prompt
> Add additional fields to the part entity for maximum and minimum inventory.

- File Name
> Part.java

- Line Number
> 46 - 51

- Changes
> I created a minInv and maxInv variable, these variables also had messages such as "Minimum Inventory Must be Positive" & "Maximum Inventory Must be Positive".

- Prompt
> Add additional fields to the part entity for maximum and minimum inventory.

- File Name
> Part.java

- Line Number
> 105 - 120

-Changes
> I created the getters and setters for the minInv and maxInv varaibles.

- Prompt
> Modify the sample inventory to include the maximum and minimum fields.

- File Name
> BiitStrapData.java

- Line Number
> 64 - 65, 75 - 76, 86 - 87, 97 - 98, 108 - 109, 119 - 120, 130 - 131, 141 - 142, 152 - 153, 163 - 164

- Changes
> I changed the sample inventory for each of my inHouseParts and outSourcedParts to have a varaible for minInv and maxInv using their setters.

- Prompt
> Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.

- File Name
> mainscreen.html

- Line Number
> 240 - 241

- Changes
> I added the Min Inventory & Max Inventory table headers to the existing table that displays the item, price, and inventory.

- Prompt
> Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.

- File Name
> mainscreen.html

- Line Number
> 250 - 251

- Changes
> I added new table data. The new table data reference the minInv and maxInv of the respective part in the table.

- Prompt
> Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.

- File Name
> OutsourcedPartForm.html

- Line Number
> 19, 23, 27, 30 - 45

Changes
> I first added p tags for each field to clarify what each field represents i.e., Name, Price, Inventory, PartID, Min Inventory, and Max Inventory. I also created two new input fields, one for minimum and one for maximum. These fields are linked to the minInv and maxInv in the databse so that they can be changed from the site. And finally I added a div tag to display error messages in a list format. These error messages let the user know if their current inventory count is outside the min-max inventory range.

- Prompt
> Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.

- File Name
> InhousePartForm.html

- Line Number
> 19, 23, 27, 30 - 45

Changes
> I first added p tags for each field to clarify what each field represents i.e., Name, Price, Inventory, PartID, Min Inventory, and Max Inventory. I also created two new input fields, one for minimum and one for maximum. These fields are linked to the minInv and maxInv in the databse so that they can be changed from the site. And finally I added a div tag to display error messages in a list format. These error messages let the user know if their current inventory count is outside the min-max inventory range.

- Prompt
> Rename the file the persistent storage is saved to.

- File Name
> application.propterties

- Line Number
> 6

- Changes
> I updated the database url to a new version so that the changes we made in BootStrapData.java would be reflected and the database would intialize with a min and max inventory column.

- Prompt
> Modify the code to enforce that the inventory is between or at the minimum and maximum value.

- File Name
> ValidInventory.java

- Line Number
> 1 - 26

- Changes
> I created a new validator. The purpose of this validator is to make sure that our inventory count falls inside the permitted min-max inventory range. This validator also contains an error message reading "Inventory outside of range".

- Prompt
> Modify the code to enforce that the inventory is between or at the minimum and maximum value.

- File Name
> InventoryValidator.java

- Changes
> I created a new validator file. This validators purpose is to check the inventory range when the user submits a new inventory count using the inhousePartForm.html or outsouredPartForm.html page. It has an if-else statement that is meant to catch errors. Firstly, setting an upperbound that checks against the maxInv variable, and secondly, setting a lower bound that checks against the minInv variable.

## STEP H
- Prompt
> Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.

- File Name
> PriceProductValidator.java

- Line Number
> 39 - 46

- Changes
> To display an error message when updating the product inventory, I created a variable to represent the desired product inv and the current part inv. I then compare that different to the min inv of the parts. If the desired product inv is greater than the minInv, then I display a message to the user letting them know the name of the part causing the error and its minimum inventory.

## STEP I
- Prompt
> Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

- File Name
> PartTest.java

- Line Numeber
> 159 - 166

- Changes
> I added a test to the PartTest.java file that tests the max inventory fields.

- Prompt
> Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

- File Name
> PartTest.java

- Line Numeber
> 168 - 175

- Changes
> I added a test to the PartTest.java file that tests the min inventory fields.

## STEP J


<strong>** DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>

# WESTERN GOVERNORS UNIVERSITY 
## D287 – JAVA FRAMEWORKS
Welcome to Java Frameworks! This is an opportunity for students to implement user interfaces and learn to leverage existing frameworks, assets, and content for object-oriented programming.
FOR SPECIFIC TASK INSTRUCTIONS AND REQUIREMENTS FOR THIS ASSESSMENT, PLEASE REFER TO THE COURSE PAGE.
## BASIC INSTRUCTIONS
For this project, you will use the Integrated Development Environment (IDE) link in the web links section of this assessment to install the IDE, IntelliJ IDEA (Ultimate Edition). All relevant links are on the course page. Please refer to the course of study for specific links. You will sign up for a free student license using your WGU.edu email address. Please see the “IntelliJ Ultimate Edition Instructions” attachment for instructions on how do this. Next you will download the “Inventory Management Application Template Code” provided in the web links section and open it in IntelliJ IDEA (Ultimate Edition). You will upload this project to a private external GitLab repository and backup regularly. As a part of this, you have been provided with a base code (starting point). 

## SUPPLEMENTAL RESOURCES  
1.	How to clone a project to IntelliJ using Git?

> Ensure that you have Git installed on your system and that IntelliJ is installed using [Toolbox](https://www.jetbrains.com/toolbox-app/). Make sure that you are using version 2022.3.2. Once this has been confirmed, click the clone button and use the 'IntelliJ IDEA (HTTPS)' button. This will open IntelliJ with a prompt to clone the proejct. Save it in a safe location for the directory and press clone. IntelliJ will prompt you for your credentials. Enter in your WGU Credentials and the project will be cloned onto your local machine.  

2. How to create a branch and start Development?

- GitLab method
> Press the '+' button located near your branch name. In the dropdown list, press the 'New branch' button. This will allow you to create a name for your branch. Once the branch has been named, you can select 'Create Branch' to push the branch to your repository.

- IntelliJ method
> In IntelliJ, Go to the 'Git' button on the top toolbar. Select the new branch option and create a name for the branch. Make sure checkout branch is selected and press create. You can now add a commit message and push the new branch to the local repo.

## SUPPORT
If you need additional support, please navigate to the course page and reach out to your course instructor.
## FUTURE USE
Take this opportunity to create or add to a simple resume portfolio to highlight and showcase your work for future use in career search, experience, and education!
