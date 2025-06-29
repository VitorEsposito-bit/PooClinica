# OOP_Clinic

This Java application allows managing a list of patients in a medical clinic, offering basic functionalities such as registration, consultation, data modification, and BMI calculation.

## Features

**Patient Registration:** Allows registering new patients in the list.

**Search by Code:** Consults information of a specific patient by code.

**Search by Name:** Consults information of a specific patient by name.

**Listing by Age:** Lists all patients with age above a specific value.

**Weight, Height, and Gender Modification:** Allows modifying the weight, height, and gender of an already registered patient.

**BMI Calculation:** Calculates and displays the Body Mass Index of a patient.

## Main Classes

### AppClinica.java
This is the program's entry point. It contains the main method that interacts with the user through the console to perform the operations mentioned above.

### ListaPacientes.java
This class manages the patient list, including methods to add patients, search by code or name, list patients with age above a certain value, and more.

### Pacientes.java
Represents the patient data class, containing attributes such as code, name, gender, weight, height, and age. Includes methods for BMI calculation, ideal weight calculation, and textual representation of the patient.