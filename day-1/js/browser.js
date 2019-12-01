var mfuel = m => Math.floor(m / 3) - 2
var fuel = m => mfuel(m) < 0 ? 0 : mfuel(m) + fuel(mfuel(m))

// navigate to https://adventofcode.com/2019/day/1/input
document.body.textContent.split('\n').map(Number).filter(Boolean).map(fuel).reduce((r, x) => r + x)
