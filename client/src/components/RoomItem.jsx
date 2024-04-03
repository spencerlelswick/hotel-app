const RoomItem = ({ roomNumber, rate, availability }) => (
  <tr className='bg-white hover:bg-gray-100'>
    <td className='border px-4 py-2'>{roomNumber}</td>
    <td className='border px-4 py-2'>${rate}</td>
    <td className='border px-4 py-2'>{availability}</td>
  </tr>
);

export default RoomItem;
