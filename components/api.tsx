// Ejemplo en un componente React con TypeScript
import React, { useEffect, useState } from 'react';

interface DatosResponse {
  datos: string;
}

const MiComponente: React.FC = () => {
  const [datos, setDatos] = useState<string>('');

  useEffect(() => {
    // Hacer una solicitud GET al endpoint /api/datos
    fetch('http://localhost:8080/api/datos')
      .then(response => response.json() as Promise<DatosResponse>)
      .then(data => setDatos(data.datos))
      .catch(error => console.error('Error al obtener datos:', error));
  }, []);

  const enviarDatosAlBackend = () => {
    // Hacer una solicitud POST al endpoint /api/enviar-datos
    fetch('http://localhost:8080/api/enviar-datos', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify({ datos: 'Información a enviar al backend' }),
    })
      .then(response => response.json() as Promise<{ mensaje: string }>)
      .then(data => console.log('Respuesta del backend:', data.mensaje))
      .catch(error => console.error('Error al enviar datos:', error));
  };

  return (
    <div>
      
      <button onClick={enviarDatosAlBackend}>Enviar Datos al Backend</button>
      <p>Datos desde el backend: {datos}</p>
    </div>

  );
};

export default MiComponente;
