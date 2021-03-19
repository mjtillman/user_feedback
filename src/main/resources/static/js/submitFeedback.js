'use strict'

function submitForm() {
  // bootstrapValidation();

  const formData = new FormData(document.getElementById("feedback")).entries();

  let jsonForm = {};
  for (const [k, v] of formData) {
    jsonForm[k] = v;
  }

  let url = String("http://localhost:8080/feedback");


    postJsonForm({url, jsonForm});

}

  function bootstrapValidation() {
    // Fetch all the forms we want to apply custom Bootstrap validation styles to
    const forms = document.getElementsByClassName('.needs-validation')

    // Loop over them and prevent submission
    Array.prototype.slice.call(forms)
        .forEach(function (form) {
          form.addEventListener('submit', function (event) {
            if (!form.checkValidity()) {
              event.preventDefault()
              event.stopPropagation()
            }

            form.classList.add('was-validated')
          }, false)
        })
  }

/**
 * @param {Object} options
 * @param {string} options.url
 * @param {Object} options.jsonForm
 * @return {Object}
 */
async function postJsonForm({url, jsonForm}) {
  const formDataJsonString = JSON.stringify(jsonForm);

  const fetchOptions = {
    method: "POST",
    headers: {
      "Content-Type": "application/json; charset=UTF-8",
      "Accept": "application/json"
    },
    body: formDataJsonString
  };

  try {
    const response =
        await fetch(url, fetchOptions);

    if (!response.ok) {
      const errorMsg = await response.text();
    }

    return response;
  } catch (ex) {
    console.log("You suck")

  }



}