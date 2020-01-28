import React from 'react';
import './App.css';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        Login Page
          <form>
              <label>
                  UserName: <input type="text" name="username"/><br/>
              </label>
              Password: <input type="text" name="password"/><br/>
              <input type='submit' value='submit'/>
          </form>
      </header>
    </div>
  );
}

export default App;
