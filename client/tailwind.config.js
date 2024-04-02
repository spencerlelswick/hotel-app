/** @type {import('tailwindcss').Config} */
module.exports = {
  content: ["./src/**/*.{html,js}"],
  theme: {
    extend: {},
  },
  daisyui: {
    themes: ["light",
    //fantasy
    //cmyk
    //autumn
    "winter",]
  },
  plugins: [require("daisyui")],
}

