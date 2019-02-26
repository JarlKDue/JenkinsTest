# miracle-base

## Prerequisites

You need the following tools to run and build this project:

* Maven
* JDK

## Build
The build runs EAP with FUSE. 

### Maven - build 
First build the project with Maven. From JARL-EAP_FUSE\Code run
```
mvn clean install
```

Then deploy on an EAP 7.1 with FUSE 7 

### Maven - set up
Remember to set up Maven settings for 'miracle-docker-intern.jfrog.io' 

#### Miracle-docker-intern.jfrog.io
https://confluence.miracle.dk/display/KNOWLEDGEMANAGEMENT/Maven 


## Product Documentation

### EAP
https://access.redhat.com/documentation/en-us/red_hat_jboss_enterprise_application_platform/7.1/


### FUSE
https://access.redhat.com/documentation/en-us/red_hat_fuse/7.1/


## Task 1

Move a file from one folder to another  - hint google "Camel File component"

Split the file into multiple lines - hint google "Camel csv"

Split the lines into multiple camel exchanges - hint google "Camel splitter"

Process each line, add some text etc. - hint google "Camel Processor"

Merge the different lines back to one camel exchanges - hint google "camel aggregator"

## Task 2

Using REST service at http://localhost:8080/rest/api/health to expose information from SOAP service at http://localhost:8080/soap/CitizenLookupService

Requirements

The result should be presented as one list

Each time a search is made, persist the RegistryName, time and number of results to a DB.

The rest service must enrich the result from the soap service with
A timestamp
Number of results

Implement logging in order to make debugging easier