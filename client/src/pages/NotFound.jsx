import React from 'react';

const NotFound = () => {
  return (
    <div className='container mx-auto mt-10'>
      <h1 className='text-4xl text-center text-red-500'>404 - Not Found</h1>
      <p className='text-center mt-4'>
        Sorry, the page you are looking for does not exist.
      </p>
    </div>
  );
};

export default NotFound;
