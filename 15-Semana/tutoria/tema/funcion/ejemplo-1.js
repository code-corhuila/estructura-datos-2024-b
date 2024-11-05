// Array para almacenar los números ingresados
const numbers = [];

// Función para agregar un número al array
function addNumber() {
    const numberInput = document.getElementById("numberInput");
    const number = parseFloat(numberInput.value);

    if (!isNaN(number)) {
        numbers.push(number);
        updateNumberList();
        numberInput.value = ""; // Limpiar el campo de entrada
    } else {
        alert("Por favor, introduce un número válido.");
    }
}

// Función para mostrar el número más grande
function getLargestNumber() {
    if (numbers.length === 0) {
        alert("No se han ingresado números.");
        return;
    }

    const largestNumber = Math.max(...numbers);
    document.getElementById("result").innerText = `El número más grande es: ${largestNumber}`;
}

// Actualizar la lista visual de números ingresados
function updateNumberList() {
    const numbersList = document.getElementById("numbersList");
    numbersList.innerHTML = "";

    numbers.forEach(number => {
        const listItem = document.createElement("li");
        listItem.className = "list-group-item";
        listItem.textContent = number;
        numbersList.appendChild(listItem);
    });
}