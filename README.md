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

## STEP G

## STEP G

## STEP H

## STEP I

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
