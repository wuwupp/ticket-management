This is a simple ticket management application where users can list, add, delete, and update incident tickets (without needing user authentication); 
all data held in memory and the appliation can run at http://localhost:8080 
Note: rebooting the application will reset the data in memory

![image](https://github.com/user-attachments/assets/8c1d99db-aa6f-41c8-a6d3-7be4ccd0dc42)

![image](https://github.com/user-attachments/assets/d39f5a0b-39bd-450e-a1c0-a5396dcaf036)

![image](https://github.com/user-attachments/assets/3c6834fa-ff1c-4a44-b404-0858c3f76778)

The JAR file is for making docker image.

Added below validation:
@NotBlank: Ensures the field is not null or empty.
@Size: Limits the length of the description to between 5 and 1000 characters.

React App as frontend:
![image](https://github.com/user-attachments/assets/92e4cbcf-5586-4bed-82ba-0a0b142b62a2)



