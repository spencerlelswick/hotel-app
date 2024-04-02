import { useEffect, useState } from 'react';
import { getAllRooms } from '../services/hotel-service';

const Rooms = () => {
  const [roomsList, setRoomsList] = useState(null);
  const [loadingRoomsList, setLoadingRoomsList] = useState(true);

  useEffect(() => {
    getRoomData();
  }, []);

  const getRoomData = async () => {
    try {
      const roomsResponse = await getAllRooms();

      if (
        roomsResponse._embedded.rooms.length ||
        roomsResponse._embedded.rooms.length === 0
      ) {
        let newList = roomsResponse._embedded.rooms;

        setRoomsList(newList);
        setLoadingRoomsList(false);
      } else {
        throw Error('Something went wrong with retrieving events.');
      }
    } catch (error) {
      console.log(error);
    }
  };

  return (
    <>
      {loadingRoomsList ? (
        <h1> loading RoomsList...</h1>
      ) : (
        <div>
          <h1>ROOMS</h1>

          <div>
            {roomsList.map((room) => (
              <h1>{room.roomNumber}</h1>
            ))}
          </div>
        </div>
      )}
    </>
  );
};

export default Rooms;
