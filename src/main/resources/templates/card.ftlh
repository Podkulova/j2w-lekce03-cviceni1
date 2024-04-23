[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
  <meta charset="UTF-8">
  <title>Kartička zákazníka</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="preconnect" href="https://fonts.gstatic.com">
  <link href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,400;0,700;1,400;1,700&display=swap" rel="stylesheet">
  <link rel="stylesheet" href="/css/style.css">
  <link rel="icon" type="image/png" href="/images/favicon.png">
</head>
<body>
<div class="container">
  <div class="person-info">
    [#if person.profileImageUrl??]
    <div class="photo-border"></div>
    <img src=${person.profileImageUrl} class="photo" alt="profilové foto"/>
      [#else]
        <small><em>Profilová fotka neuvedena </em></small>
    [/#if]
    <div class="row">
      <span class="label">Jméno</span>
      <span class="value">${person.firstname}</span>
    </div>
    <div class="row">
      <span class="label">Příjmení</span>
      <span class="value">${person.lastName}</span>
    </div>
    <div class="row">
      <span class="label">Datum narození</span>
      <span class="value">${person.birthDate?date?string.long}</span>
    </div>
    <div class="row">
      <span class="label">Věk</span>
      <span class="value">${person.age}</span>
    </div>
  </div>
  <div class="address">
    <div class="address-line">${address.streetNumber}</div>
    <div class="address-line">${address.city} ${address.ziCode}</div>
  </div>
</div>
</body>
</html>
