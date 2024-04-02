/** @type {import('tailwindcss').Config} */
module.exports = {
  content: ["./src/**/*.{html,js,jsx}"],
  theme: {
    colors: {
      primary: {
        DEFAULT: '#1E3A8A',
        dark: '#1C2D5E',
        light: '#3A66C5',
      },
      secondary: {
        DEFAULT: '#FBBF24',
        dark: '#C08400',
        light: '#FCD34D',
      },
    },
  },
  daisyui: {
    
  },
  plugins: [require("daisyui")],
}

