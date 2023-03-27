# Development Log

#### (Most recent updates at the top)

---

### 03/27/2023 - Converting to Spring MVC project with Thymeleaf

May be pre-mature, but I couldn't think of what to do next other than this. I want to build the front facing input
capacity to test that my models work as needed or if there needs to be some kind of refactoring.

Next steps are the controllers and views before establishing a connection to a database using PostgreSQL. Once those
are complete, then I'll be able to build out a single database and tweak/improve functionality, and also build returns
that correspond to a user's request for specific transaction values, types etc..

Also now would be a good time to start development in new branches since the main application is running here and I
want a place to return to.

---

### 03/23/2023 - Adding tests and helper methods

The core data structure is mostly complete and now I'm starting to build out the
base Java code for some type of minimally viable product. The next steps are to
begin writing different unit testing to ensure the structure and methods work as 
designed. This will be important further in the dev process when these are hooked up 
to MVC and a database.

Next steps include defining more helper functions for the math side of processing: median,
count, and others. Also some misc helpers that will do things like reformatting of dates
to play nicer with SQL and avoid using a Java date class. I plan to do this by transforming 
the date strings into YYYY-MM-DD and convert to ints for some of the functionality. Maybe
this is a dumb move but I don't want to mess around with java dates.

---

### 03/22/2023 - Base class refactors

My initial objects had many duplicate fields that 
could be consolidated into the abstract base class. 
There are still two classes for checking vs. credit charges,
and I'd like to consolidate those too, but I'm not yet sure 
how that looks yet.

Eventually this will be some kind of MVC application with
a persistent database to log entries. With that in mind, I'm
leaving some notes of eventual ``@ManyToMany | @ManyToOne | @OneToMany`` annotations.

---

### 03/07/2023 - Project Initialization

Budgeting apps are everywhere, and I've tried my fair share of them. But I've always run into the same problems
with them where they don't work how I want or need them to work. It's no knock on the developers of those applications,
I just find their designs don't help me actually *manage* the money I bring in and spend.

A few years ago, I ditched the apps entirely for an old-fashioned Excel spreadsheet. Instead of budgeting, the workbook
turned into more of an expense tracker where I could see where my money was going on a month-to-month basis in real time.
But this process also requires a lot of manual data entry where the chance of errors is quite high.

I want to develop this application to eliminate that potential for error while inputting expense data into a database
and as an opportunity to expand on the Java development skills I've already begun to foster. I see a lot of opportunity
to create a database of expenses that can easily more easily be queried for specific insights.

A major challenge in the course of development will be the handling of personal financial data (especially my own).
I don't know what solution I will come up with to handle that at this point, but I don't want it to be a reason not
to try and develop this. 

For now though, I'm focused on establishing the classes/objects to run the whole application and begin testing to
ensure their functionality. 