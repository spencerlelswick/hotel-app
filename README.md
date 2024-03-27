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

