import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import Cabecera from './components/Cabecera.jsx'

createRoot(document.getElementById('root')).render(
  <StrictMode>
    <Cabecera/>
  </StrictMode>,
)
