let event_btn = document.getElementById('btn')

window.onload = () => {
  clearCurrentAttempt()
  clearHTML()
}

function makeRequest() {
  const uri = "http://localhost:8080/?equation="
  let endpoint = getInput()
  let url = uri + encodeURIComponent(endpoint)
  fetch(url)
    .then(response=>response.json())
    .then(data=>{
      handleData(data)
      clearCurrentAttempt()
    })
}

function clearCurrentAttempt(){
  for (let i = 0; i < 6; i++)
    document.getElementById(`id_${i}`).value = ""
}

function handleData(data) {
  let lastAttempt = null;

  if (!data.isValidInput)	{
    clearHTML()
    alert("Invalid Input")
  } else if (!data.isFortyTwo){
    clearHTML()
    alert("Equation is not equal to Forty two")
  } else {
    lastAttempt = showTips(data)
    if (lastAttempt)
      showLastAttempt(lastAttempt)
  }
}

function clearHTML() {
  for (let i = 0; i < 6; i++)	{
    document.getElementById(`last_attempt${i}`).value = ""
    document.getElementById(`tips${i}`).value = ""
  }
}

function showLastAttempt(string) {
  for (let i = 0; i < 6; i++)
    document.getElementById(`last_attempt${i}`).value = string[i]
}

function showTips(data) {
  for (let i = 0; i < 6; i++)
    document.getElementById(`tips${i}`).value = data.tips[i]
  if (data.tips == "CCCCCC")
    alert("Congratulations, you've found the secret equation!")
  return (data.input)
}

function getInput() {
  let attempt = ""
  for (let i = 0; i < 6; i++) {
    let temp = document.getElementById(`id_${i}`).value
    attempt = attempt.concat(temp)
  }
  return attempt
}

if (event_btn) {
  event_btn.addEventListener("click", makeRequest)
}
