# Product Management

This project involves building a RESTful API for product management using `Java`, `Spring Boot`, `MySQL`, and `Postman` for testing. The API supports `CRUD` operations like retrieving, creating, updating, and deleting products.
 
Given files `ProductController.java`, `ProductRepository.java`, `ProductService.java`, `ProductInterface.java` and  `Product.java`.

### Completion Instructions

- `Product.java`: `Product` (Model) class should contain the following attributes.

    | Attribute |  Type  |
    | :-------: | :----: |
    |    pid    |  int   |
    |    name   | String |
    |   image   | String |
    |  costPrice   | int |
    |  quantity | int |
    |  origin   | String |
    |  profit   | float |
    |  sellPrice   | int |
    |    gst    | float |
    |   amount  | int |
    

- `ProductRepository.java`: Create an `interface` containing required methods.
- `ProductInterface.java`: Provides Abstract methods which should be implemented in Service class.
- `ProductService.java`: Implements the Abstract Methods.
- `ProductController.java`: Create the controller class to handle HTTP requests.  

Implement the following APIs.

### API 1

#### Path: `/allProducts`

#### Method: `GET`

#### Description:

Returns a list of all `products`.

#### Response

```
[
    {
        "pid": 101,
        "name": "Samsung Galaxy S24",
        "image": "https://th.bing.com/th/id/OIP.O6Q0e4UmP3pfw-ovYg4k_QAAAA?w=181&h=182&c=7&r=0&o=5&dpr=1.3&pid=1.7",
        "costPrice": 66000,
        "quantity": 2,
        "origin": "South Korea",
        "profit": 9900.0,
        "sellPrice": 75900,
        "gst": 13662.0,
        "amount": 151800
    },
   ...
]
```

### API 2

#### Path: `/save`

#### Method: `POST`

#### Description:

Creates a new product in the `productList`.

#### Request

```
{
    "pid" : 105,
    "name" : "iPhone 16 pro",
    "image" : "https://th.bing.com/th/id/OIP.WJgG0-v1zkdtxP0L07G_BgHaJP?w=133&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7",
    "costPrice" : 127000,
    "quantity" : 1,
    "origin" : "United State"
}
```

#### Response

```
{
    "pid": 105,
    "name": "iPhone 16 pro",
    "image": "https://th.bing.com/th/id/OIP.WJgG0-v1zkdtxP0L07G_BgHaJP?w=133&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7",
    "costPrice": 127000,
    "quantity": 1,
    "origin": "United State",
    "profit": 19050.0,
    "sellPrice": 146050,
    "gst": 26289.0,
    "amount": 172339
}
```

### API 3

#### Path: `/product/{pid}`

#### Method: `GET`

#### Description: 
 
Returns a product based on the `id`. 


#### Success Response

```
{
    "pid": 103,
    "name": "xiaomi 14 ultra ",
    "image": "https://th.bing.com/th/id/OIP.z0A1zlpsB6K9IMg3QhJCNwAAAA?w=163&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7",
    "costPrice": 100000,
    "quantity": 1,
    "origin": "China",
    "profit": 15000.0,
    "sellPrice": 115000,
    "gst": 20700.0,
    "amount": 135700
}
```

### API 4

#### Path: `/update/{pid}`

#### Method: `PUT`

#### Description:

Updates the existing details of a product in the `ProductList` based on the `id`. If Product doesn't exist then it gives response as Product Not Found with id : pid.

#### Request

```
{
   "quantity": 3,
}
```

#### Success Response

```
{
    "pid": 103,
    "name": "xiaomi 14 ultra ",
    "image": "https://th.bing.com/th/id/OIP.z0A1zlpsB6K9IMg3QhJCNwAAAA?w=163&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7",
    "costPrice": 100000,
    "quantity": 3,
    "origin": "China",
    "profit": 15000.001,
    "sellPrice": 115000,
    "gst": 20700.0,
    "amount": 407100
}
```

### API 5

#### Path: `/delete/{pid}`

#### Method: `DELETE`

#### Description:

Deletes a product from the `productList`  based on the `id`.

#### Success Response

```
{
   Product Deleted Successfully...
}
```


**Do not modify the code in `ProductApplication.java`**
