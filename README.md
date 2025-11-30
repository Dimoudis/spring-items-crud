Spring Items CRUD

This is a small Spring Boot project that manages items stored in a MySQL database.
The app provides basic REST endpoints for adding items, listing them, and searching by code.


◉ItemController
Handles the API endpoints

GET /items – returns all items,
POST /addItem – adds a new item, 
GET /items/{code} – finds an item by code

◉ItemService
Contains the logic used by the controller:

getAllItems()
addItem()
findItemById()

◉Item

Entity mapped to the database table.
Fields: code, name, price.

◉ItemRepository:
Extends JpaRepository to access the database without writing SQL.

◉Database: 
Uses MySQL.
The table is created automatically based on the Item entity.

◉Testing:
You can test with Postman:

GET all items: http://localhost:8080/items,
POST add item: http://localhost:8080/addItem,
GET item by code: http://localhost:8080/items/{code}
