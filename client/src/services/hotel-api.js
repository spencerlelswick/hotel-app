const BASE_URL = process.env.REACT_APP_API_URL;
const ROOMS_URL = BASE_URL + '/rooms';

export async function index() {
  const res = await fetch(ROOMS_URL, {
    method: 'GET',
  })

  if (res.ok) {
    return res.json();
  } else {
    return new Error('Invalid Request');
  }
}
