import { Routes, Route } from "react-router-dom";
import GlobalStyle from "./components/style/GlobalStyles";
import Main from "./pages/Main";
import Layout from "./pages/Layout";
import DetailPage from "./pages/DetailPage";
import LoginPage from "./pages/LoginPage";
import Signup from "./pages/Signup";
import CocktailRegistration from "./pages/CocktailRegistration";
import Error from "./pages/Error";

function App() {
  return (
    <>
      <GlobalStyle />
      <Routes>
        <Route element={<Layout />}>
          <Route path="/" element={<Main />} />
          <Route path="/custom" element={<Main />} />
          <Route path="/searched" element={<Main />} />
          <Route path="/detail" element={<DetailPage />} />
          <Route
            path="/cocktailRegistration"
            element={<CocktailRegistration />}
          />
        </Route>
        <Route path="/login" element={<LoginPage />} />
        <Route path="/signup" element={<Signup />} />
        <Route path="*" element={<Error />} />
      </Routes>
    </>
  );
}

export default App;
