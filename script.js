// script.js
function submitForm() {
    // ... (existing code remains unchanged)
}

function resetForm() {
    document.getElementById("firstName").value = "";
    document.getElementById("lastName").value = "";
    document.getElementById("dob").value = "";
    document.getElementById("country").value = "";
    document.querySelectorAll('input[name="gender"]').forEach(e => e.checked = false);
    document.getElementById("profession").value = "";
    document.getElementById("email").value = "";
    document.getElementById("mobile").value = "";
}

function closePopup() {
    document.getElementById("popup").style.display = "none";
}
