const Error = ({ message }) => (
  <div className='flex flex-col items-center justify-center h-screen bg-gray-100'>
    <svg
      className='w-16 h-16 text-red-500 mb-4'
      fill='none'
      viewBox='0 0 24 24'
      stroke='currentColor'
    >
      <path
        strokeLinecap='round'
        strokeLinejoin='round'
        strokeWidth='2'
        d='M6 18L18 6M6 6l12 12'
      />
    </svg>
    <h2 className='text-xl font-semibold text-red-500 mb-2'>
      Oops! An error occurred.
    </h2>
    <p className='text-gray-600'>{message}</p>
  </div>
);

export default Error;
