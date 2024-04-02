import React from 'react';
import { NavLink } from 'react-router-dom';

const NavBar = () => {
  return (
    <nav className='bg-gray-800 text-white'>
      <div className='container mx-auto px-4'>
        <ul className='flex justify-between items-center py-4'>
          <li>
            <NavLink exact to='/' activeClassName='text-blue-500'>
              Home
            </NavLink>
          </li>
          <li>
            <NavLink to='/about' activeClassName='text-blue-500'>
              About
            </NavLink>
          </li>
          <li>
            <NavLink to='/rooms' activeClassName='text-blue-500'>
              Rooms
            </NavLink>
          </li>
        </ul>
      </div>
    </nav>
  );
};

export default NavBar;
