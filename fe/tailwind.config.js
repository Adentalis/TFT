// tailwind.config.js
module.exports = {
  purge: [],
  darkMode: false, // or 'media' or 'class'
  theme: {
    extend: {
      colors: {
        'beige': 'beige',
        'aliceblue': 'aliceblue',
        'aqua': 'aqua',
        'gold': 'gold',
      },
      fontFamily: {
        'verdana': ['Verdana', 'Geneva', 'Tahoma', 'sans-serif'],
      }
    },
  },
  variants: {
    extend: {},
  },
  content: ["./src/**/*.{js,jsx,ts,tsx,vue}"],
  plugins: [],
}