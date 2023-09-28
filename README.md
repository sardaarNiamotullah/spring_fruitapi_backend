### A practice Back-End project to learn some simple database(MONGODB) operations<br> with the help of Java-based(Spring-Boot) backend. <br><br>

To run the project on your local machine at first download the the dataset from the dataset repository, then <br>
set it to your own database and connect it to your Spring Boot app via using the application.properties file.

Then run the application via ```mvn spring-boot:run``` command in your terminal.

Type **getallfruits** after our home url to see all fruits we have. <br>
i.e tpye **"127.0.0.1:8000/getallfruits"** in your url bar to see all fruits we have.
<br><br>
Type **afruit/{yourfruitname}** after our home url to see the fruit you wanted. <br>
i.e tpye **"127.0.0.1:8000/afruit/nameofyourfruit"** in your url to see the your desired fruit.<br>
If your desired fruit isn't available in our database you will see a null message or an empty jason.
<br><br>
Type **addfruit** after our home url to add a fruit to the database.<br>
i.e tpye **"127.0.0.1:8000/addfruit"** in your url bar to add a fruit to the database.<br>
Don't forget to add it via the post method and add the data of the fruit in json format.