function loginApi(data) {
  return $axios({
    'url': '/employee/login',
    'method': 'post',
    data
  })
}

function logoutApi(){
  return $axios({
    'url': '/employee/logout',
    'method': 'post',
  })
}


function registerApi(data){
  return $axios({
    'url': '/employee/register',
    'method': 'post',
    data
  })
}

// function resetApi(params){
//   return $axios({
//     'url': '/employee/reset',
//     'method': 'put',
//      data:{...params}
//   })
// }

const resetApi = (params) => {
  return $axios({
    url: '/employee/reset',
    method: 'put',
    data:params
  })
}