# Product Project using BackEnd
 
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
- `TodoController.java`: Create the controller class to handle HTTP requests.  

Implement the following APIs.

### API 1

#### Path: `/todos`

#### Method: `GET`

#### Description:

Returns a list of all `todos` in the `todoList`.

#### Response

```
[
    {
        "id": 1,
        "todo": "Watch Movie",
        "priority": "LOW",
        "status": "TO DO"
    },
   ...
]
```

### API 2

#### Path: `/todos`

#### Method: `POST`

#### Description:

Creates a new todo in the `todoList`. The `id` is auto-incremented.

#### Request

```
{
    "todo": "Read Book",
    "priority": "MEDIUM",
    "status": "TO DO"
}
```

#### Response

```
{
    "id": 6,
    "todo": "Read Book",
    "priority": "MEDIUM",
    "status": "TO DO"
}
```

### API 3

#### Path: `/todos/{id}`

#### Method: `GET`

#### Description:

Returns a todo based on the `id`. If the given `id` is not found in the `todoList`, raise `ResponseStatusException` with `HttpStatus.NOT_FOUND`.


#### Success Response

```
{
    "id": 3,
    "todo": "Buy Groceries",
    "priority": "MEDIUM",
    "status": "TO DO"
}
```

### API 4

#### Path: `/todos/{id}`

#### Method: `PUT`

#### Description:

Updates the details of a todo in the `todoList` based on the `id`. If the given `id` is not found in the `todoList`, raise `ResponseStatusException` with `HttpStatus.NOT_FOUND`.

#### Request

```
{
    "status": "DONE"
}
```

#### Success Response

```
{
    "id": 3,
    "todo": "Buy Groceries",
    "priority": "MEDIUM",
    "status": "DONE"
}
```

### API 5

#### Path: `/todos/{id}`

#### Method: `DELETE`

#### Description:

Deletes a todo from the `todoList`  based on the `id`. If the given `id` is not found in the `todoList`, raise `ResponseStatusException` with `HttpStatus.NOT_FOUND`.


**Do not modify the code in `TodoApplication.java`**
