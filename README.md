# Employee Management System - Spring Core

## 📌 Overview

This Employee Management System is built using **Spring Core** and demonstrates the usage of **Dependency Injection (DI)** with both **Constructor Injection** and **Setter Injection**. It allows you to manage employee data and perform operations like adding, updating, and retrieving employee records.

## 📌 Technologies Used

- **Spring Core** (for Dependency Injection)
- **Java** (backend logic)
- **Maven** (for build management)
- **Spring Beans** (for DI configuration)

## 📌 Features

- **Employee Management**: Add, update, and retrieve employee details.
- **Constructor Injection**: Inject dependencies via the constructor in service classes.
- **Setter Injection**: Use setter methods for injecting dependencies in controller classes.
- **Spring XML Configuration**: Manage bean configurations and wiring through XML.

## 🚀 Project struture
![image](https://github.com/user-attachments/assets/62b4a93e-74b5-41f0-8625-4613b1ff1f72)


## 🚀 Setup and Installation

### 📌 Prerequisites
- **Java 11 or higher**
- **Maven**

### Clone the Repository
```
git clone https://github.com/your-username/Employee_Management_System_SpringCore.git
```

### Setter Injection
```
<bean id="employeeController" class="com.employee.EmployeeController">
    <property name="employeeService" ref="employeeService"/>
</bean>

```
### Sample Data
```
Employee employee = new Employee(1, "John Doe", "Software Engineer");
employeeService.addEmployee(employee);
```

### Notes:
1. Replace `your-username` with your GitHub username in the clone command.
2. Adjust the `pom.xml` for any additional dependencies if required.
3. This `README.md` assumes a simple Spring Core application without additional complexities like databases or external services.
