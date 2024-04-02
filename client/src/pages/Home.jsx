import React from 'react';

const Home = () => {
  return (
    <div className='bg-gray-100 min-h-screen flex flex-col justify-center items-center p-8'>
      <h1 className='text-primary-dark text-5xl font-extrabold text-center mb-8'>
        Hotel App
      </h1>
      <p className='text-secondary-dark text-lg text-center mb-8'>
        Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum ante
        ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae;
        Nulla dapibus dapibus lectus, nec malesuada neque vulputate eget.
        Integer quis justo quis nisl eleifend suscipit.
      </p>
      <button className='btn btn-primary py-2 px-6 rounded-full transition duration-300 ease-in-out'>
        Explore Rooms
      </button>
    </div>
  );
};

export default Home;
