import { useState } from 'react';
import './App.css';

function App() {
  const[emailContent,setEmailContent] = useState('');
  const[tone,setTone] = useState('');
  const[generatedReply,setGeneratedReply] = useState('');
  const[loading,setLoading] = useState('');
  const[error,setError] = useState('');

  return (
    <>
        <p>Hello</p>
    </>
  )
}

export default App
