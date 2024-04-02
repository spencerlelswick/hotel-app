import * as hotelAPI from './hotel-api';

export async function getAllRooms(newData) {
  try {
    const data = await hotelAPI.index(newData);
    console.log(data);
    return data;
  } catch (err) {
    return err;
  }
}
