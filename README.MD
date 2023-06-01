## How to run
Run `src/main/java/com/kurtsevich/computerstore/ComputerStoreApplication.java`

## Database
H2 Database console is available at http://localhost:8080/h2-console  
JDBC URL: `jdbc:h2:mem:computerstore`

## Test data
The test data is set up in `src/main/java/com/kurtsevich/computerstore/configuration/AppConfig.java`

## Requests
### Computers
#### Get Computers
<pre>curl --location 'http://localhost:8080/api/products/computers/1' \
--header 'Content-Type: application/json' \
--data ''</pre>
#### Get All Computers
<pre>curl --location 'http://localhost:8080/api/products/computers' \
--header 'Content-Type: application/json' \
--data ''</pre>
#### Get All Computers By Type
<pre>curl --location 'http://localhost:8080/api/products/computers?type=DESKTOP' \
--header 'Content-Type: application/json' \
--data ''</pre>
#### Create Computers
<pre>
curl --location 'http://localhost:8080/api/products/computers' \
--header 'Content-Type: application/json' \
--data '{
"seriesNumber": "Some number",
"producer": "Some producer",
"price": 100.2,
"count": 999,
"computerType": "DESKTOP"
}'
</pre>
#### Update Computers
<pre>curl --location --request PUT 'http://localhost:8080/api/products/computers' \
--header 'Content-Type: application/json' \
--data '{
    "id": 3,
    "seriesNumber" : "num",
    "producer": "Update",
    "price": 99.2,
    "count": 777,
    "computerType": "DESKTOP"
}'</pre>
#### Delete Computers By Id
<pre>curl --location --request DELETE 'http://localhost:8080/api/products/computers/1' \
--header 'Content-Type: application/json' \
--data ''</pre>
### HDD
#### Get HDD
<pre>curl --location 'http://localhost:8080/api/products/hdds/1' \
--header 'Content-Type: application/json' \
--data ''</pre>
#### Get All HDD
<pre>curl --location 'http://localhost:8080/api/products/hdds' \
--header 'Content-Type: application/json' \
--data ''</pre>
#### Get All HDD By Capacity
<pre>curl --location 'http://localhost:8080/api/products/hdds?capacity=512' \
--header 'Content-Type: application/json' \
--data ''</pre>
#### Create HDD
<pre>curl --location 'http://localhost:8080/api/products/hdds' \
--header 'Content-Type: application/json' \
--data '{
    "seriesNumber": "num",
    "producer": "Some producer",
    "price": 100.2,
    "count": 999,
    "capacity": 512
}'</pre>
#### Update HDD
<pre>curl --location --request PUT 'http://localhost:8080/api/products/hdds' \
--header 'Content-Type: application/json' \
--data '{
    "id": 3,
    "seriesNumber" : "num",
    "producer": "Update",
    "price": 99.2,
    "count": 777,
    "cpacity": 256
}'</pre>
#### Delete HDD By Id
<pre>curl --location --request DELETE 'http://localhost:8080/api/products/1' \
--header 'Content-Type: application/json' \
--data ''</pre>
### Monitor
#### Get Monitor
<pre>curl --location 'http://localhost:8080/api/products/monitors/1' \
--header 'Content-Type: application/json' \
--data ''</pre>
#### Get All Monitor
<pre>curl --location 'http://localhost:8080/api/products/monitors' \
--header 'Content-Type: application/json' \
--data ''</pre>
#### Get All Monitor By Diagonal
<pre>curl --location 'http://localhost:8080/api/products/monitors?diagonal=27' \
--header 'Content-Type: application/json' \
--data ''</pre>
#### Create Monitor
<pre>curl --location 'http://localhost:8080/api/products/monitors' \
--header 'Content-Type: application/json' \
--data '{
    "seriesNumber": "num",
    "producer": "Some producer",
    "price": 100.2,
    "count": 999,
    "diagonal": 27
}'</pre>
#### Update Monitor
<pre>curl --location --request PUT 'http://localhost:8080/api/products/monitors' \
--header 'Content-Type: application/json' \
--data '{
    "id": 3,
    "seriesNumber" : "num",
    "producer": "Update",
    "price": 99.2,
    "count": 777,
    "diagonal": 31
}'</pre>
#### Delete Monitor By Id
<pre>curl --location --request DELETE 'http://localhost:8080/api/products/monitors/1' \
--header 'Content-Type: application/json' \
--data ''</pre>
### Notebook
#### Get Notebook
<pre>curl --location 'http://localhost:8080/api/products/notebooks/1' \
--header 'Content-Type: application/json' \
--data ''</pre>
#### Get All Notebook
<pre>curl --location 'http://localhost:8080/api/products/notebooks' \
--header 'Content-Type: application/json' \
--data ''</pre>
#### Get All Notebook By Screen Size
<pre>curl --location 'http://localhost:8080/api/products/notebooks?screenSize=17' \
--header 'Content-Type: application/json' \
--data ''</pre>
#### Create Notebook
<pre>curl --location 'http://localhost:8080/api/products/notebooks' \
--header 'Content-Type: application/json' \
--data '{
    "seriesNumber": "num",
    "producer": "Some producer",
    "price": 100.2,
    "count": 999,
    "screenSize": 17
}'</pre>
#### Update Notebook
<pre>curl --location --request PUT 'http://localhost:8080/api/products/notebooks' \
--header 'Content-Type: application/json' \
--data '{
    "id": 3,
    "seriesNumber" : "num",
    "producer": "Update",
    "price": 99.2,
    "count": 777,
    "screenSize": 17
}'</pre>
#### Delete Notebook By Id
<pre>curl --location --request DELETE 'http://localhost:8080/api/products/notebooks/1' \
--header 'Content-Type: application/json' \
--data ''</pre>