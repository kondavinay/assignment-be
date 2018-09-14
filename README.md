Robobank

Purpose of the project Rabobank receives monthly deliveries of customer statement records. This information is delivered in two formats, CSV and XML. These records need to be validated.

Field	: Description

A numeric value : Transaction reference

Account number : An IBAN

Start Balance: The starting balance in Euros

Mutation : Either and addition (+) or a deducation (-)

Description : Free text

End Balance : The end balance in Euros

com.rabo.statementprocessor project:

FileReader Package:

This package consists of two classes

csv file reader : csv file reader class implements Fileprocessor interface and reads the csv file.

Xml file reader : xml file reader class implements Fileprocessor interface and reads the xml file.

Pojo package : In this package csv and xml pojo class was declared which was used in the file reader package classes.

Validation package: This package consists of two classes

1)File reader processing class: This class receives the input from the csv file reader and xml file reader and passes the input to validation class

2)validationclass : consists of a validation method which performs the validation on duplicate record references and end balance not matched records

Interface: This file processor interface consists of a method process which was implements by the file reader package classes

StatementprocessorPackage:

Fileconfigclass: The configuration and componentscan annotations were used in this class for assigining the base packages. Statementprocessorclass: This class consists of the method csvandxmlFileReading which was autowired.

CustomerDetailsClass: This is the main class by using applicationcontext reference the csv and xml reader class can be invoked by using primary annotation in filereaderpackage classes.

input.csv is the file i have used has the reference file in CsvFileReader.

input.xml is the file i have used has the reference file in XmlFileReader.

csvfileoutput:This file consists the details of failed record references and end balance success and failed validations of csv file.

xmlfileoutput:This file consists the details of failed record references and end balance success and failed validations of xml file.
