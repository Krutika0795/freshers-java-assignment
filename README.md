# Assignment - Shopping Simulation

You have to design and implement a physical shopping store simulation. This is an extremely fun and innovative requirement, hence you have complete freedom to let your imagination go wild and showcase your technical skills while adhering to the broad requirements laid out below.

Also note that though you obviously can take the easy route and search online for a solution, this assignment is really about displaying your own analytical and technical skills, so the more individuality you show, the better shall be your prospects.

Also please note that it is not how much you cover but how you approach the solution which we are really interested in, hence make sure you commit code regularly as we would be closely monitoring the progress on a daily basis.

Use this opportunity to show us what you have got and that you have what it takes to join us as we build a wonderful product together.

# Functional Requirements
Below are listed the functional requirements that the solution should support. Wherever in doubt, make reasonable assumptions and move forward but please do document those assumptions as well so that we know why you made them.

Imagine a day in the life of a physical shopping store such as a Pantaloons. A lot of shoppers go there, grab a shopping cart / bag, add some items to it randomly and then finally decide whether or not to purchase the items or not. What the solution has to provide is a way to simulate a random shopping experience and report statistics as the simulation runs. Some of the data that could be reported are
- Who enters the store and at what time
- Who leaves the store and at what time
- What is the state of any shopper's cart
- How many shoppers are there in the store at any point of time
- What is the state of the inventory on shelf in the store for all items / any particular item
- If a shopper decides to make a purchase, what is the total cost of all the items in his cart

Please keep in mind some of the real-life constraints of shopping physically versus online. Some of these are listed below for reference -

- Shoppers come into the store and go out of the store in parallel and also shop simultaneously
- A store does not have an infinite number of shopping carts. So the moment one shopper picks up a shopping cart, it wont be available to other shoppers. When all shopping carts are in use, any new shopper would be denied a shopping cart
- A store does not have infinite stock. So when a shopper adds an item to the shopping cart, it is no longer available to any other shopper. When all quantity for a particular item is exhausted, a new shopper wont even be able to see the item, leave alone adding it to the shopping cart
- Items have prices. So at any given point of time, one should be able to compute the total value of all the items in a person's shopping cart
- Shoppers have distinct profiles as in, they are interested in particular categories of products, they are light shoppers (buy less) or heavy shoppers (buy more), they visit at particular times of the day, etc. 

The final solution should allow us to run a simulation by providing a set of arguments such as
- Total number of shoppers (their profiles should be assigned randomly by you and should not be fixed)
- The minimum and maximum number of shoppers who shop in parallel
- Modifications to the items and inventory in the store (the store would have an initial set but we should be able to alter it) 

# Technical requirements
- Java as the programming language to develop the solution
- Maven should be used as the build system for compiling and producing the final binary
- The solution should produce a Jar file which we can run from the command line by passing necessary arguments to perform the simulation
- Classpath dependencies that we would need to meet in order to be able to run the solution

## Desirable
- Ability to store the state of the store at any given instant (shoppers, items, inventory, etc.) to a file on disk (XML or JSON format)
- A simple web based user interface which would allow us to provide the arguments and run the simulation by clicking a button
- The web user interface should show us the simulation on the screen as it runs (similar to what would have been shown had we used the command line to run it)
 
# How to submit the assignment
## Step 1
Fork this repository, and create a subdirectory titled with your name and any other optional text describing your solution
## Step 2
Complete coding for your solution
## Step 3
Submit a pull request to this repository before the stipulated due date for the assignment. Everything related to your solution should be within the subdirectory you created above
## Step 4
Include at a minimum one README file describing your solution along with detailed instructions on how to run it. You can have as many documentation files as you want. Use Markdown for the documentation

# Important
You would need to mandatorily submit a pull request, without which we cannot consider your assignment for evaluation. Also ensure that you submit only one pull request and that too only after you are fully ready to share your assignment with us.

We really look forward to getting some bright minds who can show us all their creativity and aptitude through this assignment.

## All the best and happy coding :-)


