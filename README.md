# hotel-app

## Requirements

- AAU - Select a room
- AAU - Reserve a room
- AAU - Cancel a reservation
- AAU - Select a room

- AAM - Set a room in cleaning status
- AAM - Remove customer from room
- AAM - Manage and view status of each room
- AAM - Dashboard of room stats / occupancy

## Endpoints

- /reserve
- - Params: room_id, start_time, end_time
- - Returns: reservation_id

- /cancel
- - Params: reservation_id

- /open_rooms
- - Params: current_time
- - Returns: List<Room> open_rooms

## DB

### Reservation

- id serial (PK)
- room_id int (FK)
- start timestamp
- end timestamp

### Room

- id serial (PK)
- rate decimal
- room_number int

### User

- id serial (PK)
- email varchar
- password varchar (hash)
- first_name varchar
- last_name varchar
- role enum (user / manager)

## Features

### Front End

### Back End

## Technologies Used

### MERN Stack Application

- HTML
- CSS
- JS
- Tailwind
- Daisy
- Angular
- Spring
- Java
- MySQL
- Heroku
- Netlify
