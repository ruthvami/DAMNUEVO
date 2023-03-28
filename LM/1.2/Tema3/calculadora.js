function setResult(value) {
    document.getElementById('result').innerHTML = value;
}
function getResult() {
    return (document.getElementById('result').innerHTML);
}
function add(key) {
    var result = getResult();
    if (result != '0' || isNaN(key)) setResult(result + key);
    else setResult(key);
}
function calc() {
    var result = eval(getResult());
    setResult(result);
}
function del() {
    setResult(0);
}

function raiz() {
    var result = Math.sqrt(getResult());
    setResult(result);
}
function cos() {
    var result = Math.cos(getResult());
    setResult(result);
}
function sen() {
    var result = Math.sen(getResult());
    setResult(result);
}
function tan() {
    var result = Math.tan(getResult());
    setResult(result);
}
