import axios from 'axios';

const BASE_URL = process.env.REACT_APP_API_URL;
const ROOMS_URL = BASE_URL + '/rooms';

const hotelApi = axios.create({
  baseURL: BASE_URL,
});

export const getAllRooms = async () => {
  try {
    const response = await hotelApi.get(ROOMS_URL);
    return response.data._embedded.rooms;
  } catch (error) {
    throw error;
  }
};

export default hotelApi;
