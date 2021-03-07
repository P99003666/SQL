<h1>Mini Project
  </h1>
  src

|

|__ com.ltts.model (Two Model Class)

|

|__ com.ltts.Dao (Two DAO Class)

|

|_______public List<ModelClassName> getAll...()

|

|_______public <ModelClassName> getModelById(int id)

|

|_______public boolean insert<ModelName>(ModelClass mc)

|

|_______public boolean update<ModelName>(int id)|

|__ com.ltts.Configuration (One Class MyConfiguration)

|

|__ use db.properties file 

|

|_ com.ltts.main





Statment Types

Type 1: ODBC -driver

Operting System Specific

Type 2: OCI – Drive (only)

Driver for Specific databases – Oracle

Type 3: Native Driver -

Third party – Database independent; (Thick Driver)

Type 4: Pure Driver

(Thin Driver)

1. Loading the Driver

2. Provide the Connection (I)

Connection c=DriverManager. getConnection(“”);

3. Action / Statement

Statement s=c.createStatement();

4. If Buy – I have to Accommodate

s.execute(“select *”);

//Only for select

ResultSet for getdata

s.execute(“Insert”);

5. Close the Connection.

Statement 3 type

1. Statement

2. PreparedStatement

3. CallableStatement
