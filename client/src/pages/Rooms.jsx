import { useEffect, useState } from 'react';
import { getAllRooms } from '../services/hotel-service';
import RoomItem from '../components/RoomItem';
import Loading from '../components/Loading';
import Error from '../components/Error';

const Rooms = () => {
  const [roomsList, setRoomsList] = useState(null);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);

  useEffect(() => {
    getRoomData();
  }, []);

  const getRoomData = async () => {
    try {
      getAllRooms()
        .then((data) => {
          setRoomsList(data._embedded.rooms);
          setLoading(false);
        })
        .catch((error) => {
          console.error('Error:', error);
          setError('Failed to fetch rooms.');
          setLoading(false);
        });
    } catch (error) {
      console.log(error);
    }
  };

  if (loading) {
    return <Loading />;
  }

  if (error) {
    return <Error message={error} />;
  }

  return (
    <>
      <div className='p-6'>
        <h1 className='text-2xl mb-4'>Rooms</h1>
        <table className='min-w-full bg-white'>
          <thead>
            <tr>
              <th className='bg-gray-100 border text-left px-8 py-4'>
                Room Number
              </th>
              <th className='bg-gray-100 border text-left px-8 py-4'>Rate</th>
              <th className='bg-gray-100 border text-left px-8 py-4'>
                Availability
              </th>
            </tr>
          </thead>
          <tbody>
            {roomsList.map((room) => (
              <RoomItem
                key={room.roomNumber}
                roomNumber={room.roomNumber}
                rate={room.rate}
                availability={room.availability}
              />
            ))}
          </tbody>
        </table>
      </div>
    </>
  );
};

export default Rooms;
