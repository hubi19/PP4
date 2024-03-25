async function logMovies() {
  const response = await fetch("api/products");
  const movies = await response.json();
  console.log(products);
}


alert("it works");