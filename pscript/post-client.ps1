function post($url){
    $res = curl $url -Method POST -ContentType "application/json" | Select -ExpandProperty Content
    [System.Text.Encoding]::ASCII.GetString($res)
}

Write-Host "Url: http://localhost:8030/actuator/refresh [POST]"
#$url = Read-Host 
$url= "http://localhost:8030/actuator/refresh"
post $url