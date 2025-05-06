const jsonServer = require('json-server')
const server = jsonServer.create()
const router = jsonServer.router('student.json')
const middlewares = jsonServer.defaults()

// API Key Validation Middleware
server.use((req, res, next) => {
  const apiKey = req.get('x-api-key')
  
  // Replace with your actual valid API key
  const validApiKey = 'SECRET_KEY_123' 
  
  if (!apiKey || apiKey !== validApiKey) {
    return res.status(401).json({ error: 'Unauthorized - Invalid API Key' })
  }
  
  next() // Continue to JSON Server router
})

server.use(middlewares)
server.use(router)

const PORT = 3000
server.listen(PORT, () => {
  console.log(`JSON Server is running with API key protection on port ${PORT}`)
})