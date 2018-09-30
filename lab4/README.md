## CRC Cards

1. Card 1
    - Class name: Table
    - Responsibilities: Number of seats, Book, Free, Change State
    - Collaborators: None

2. Card 2
    - Class name: Table Manager
    - Responsibilities: Status of each table, Book
    - Collaborators: Table, Waitlist Manager
    
3. Card 3
    - Class name: Waitlist Manager
    - Responsibilities: Get customer information, Select customer, Book
    - Collaborators: Customer, Table Manager
    
4. Card 4
    - Class name: Customer
    - Responsibilities: Provide information viz. Name, Cell phone number, Number of people, Respond
    - Collaborators: Waitlist Manager
    
(CRC.png inside the repo)

## Design Pattern

- The Observer design pattern is used in this Lab
- Reason: The lab needed an entity to see through the availaibility of the tables as and when they become vacant.
Also, the number of seats of each table needed to be monitored. The Observer pattern enables us to satisfy this use case.
In the CRC cards, the Waitlist Manager is our Observer and the Table Manager is our Subject, which itself gets the information
about the tables. When any table becomes available, the Table Manager conveys the status of each table to the Waitlist Manager.
- As a result, Observer pattern is used in this scenario with Table Manager as the Subject and the Waitlist Manager as the Observer.
