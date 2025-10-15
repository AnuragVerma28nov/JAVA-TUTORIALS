## TESTING THE  API 
 
### 1. GET All Students 
       GET http://localhost:8080/api/students 
       Output: 
       [ 
        {"id": 1, "name": "Anurag", "department": "Computer Science"}, 
        {"id": 2, "name": "Kartik", "department": "Electrical Engineering"}, 
        {"id": 3, "name": "Amit", "department": "Mechanical Engineering"} 
       ] 
 
### 2. GET Student by ID (2) 
       GET http://localhost:8080/api/students/2 
       Output: 
        {"id": 2, "name": "Kartik", "department": "Electrical Engineering"} 
 
### 3. POST New Student 
       POST http://localhost:8080/api/students 
       Body: {"id": 4, "name": "Sumit", "department": "Civil Engineering"} 
       Output: 
        {"id": 4, "name": "Sumit", "department": "Civil Engineering"} 
 
### 4. PUT Update Student (3) 
       PUT http://localhost:8080/api/students/3 
       Body: {"id": 3, "name": "Sunny", "department": "Aerospace Engineering"} 
       Output: 
        {"id": 3, "name": "Sunny", "department": "Aerospace Engineering"} 
 
### 5. DELETE Student (2) 
       DELETE http://localhost:8080/api/students/2 
       Output: 
        Student with ID 2 deleted 
  
### 6. Final State After All Operations: 
       GET http://localhost:8080/api/students 
       Output: 
        [ 
         {"id": 1, "name": "Anurag", "department": "Computer Science"}, 
         {"id": 3, "name": "Sunny", "department": "Aerospace Engineering"}, 
         {"id": 4, "name": "Sumit", "department": "Civil Engineering"} 
        ]