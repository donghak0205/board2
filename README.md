# Board2
The project is the second version of the bulletin board project. The Board2 added rest-api to the board project.  
In other words, Crud(Create, Read, Update, Delete) is performed through the rest-api server.  **In order to run Crud, you must run Rest-Api.**  
  

* Client(8080) : https://github.com/donghak0205/board2
* Rest-Api(8081) : https://github.com/donghak0205/restapi

## Information
### 1. Front End
 > 1. Thymeleaf
 > 2. Jquery
 > 3. Ajax
 
 
 ### 2. Back End
> 1. Spring boot 2.2.3
> 2. Gradle
> 3. Java 8
> 4. H2
> 5. lombok
> 6. JPA


### 3. DB
|  <center>Filed Name</center> |  <center>Data Type</center> |  <center>Length</center> | <center>PK</center>  |
|:--------|:--------:|--------:|:--------:|
|**idx** | <center>Long </center> | | O| 
|**title** | <center>varchar</center> |255 | | | 
|**subTitle** | <center>varchar</center> |255 | | 
|**content** | <center>varchar </center> |255| | 
|**boardType** | <center>varchar </center> |255 | |
|**created_datetime** | <center>datetime </center> |TIMESTAMP |
|**updated_datetime** | <center>datetime </center> |TIMESTAMP | 
