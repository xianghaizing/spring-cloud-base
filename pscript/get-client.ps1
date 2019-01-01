function get ($url){
    curl $url | Select -ExpandProperty Content
}
Write-Host "Url: http://localhost:8888/lyf/dev [GET]"
#$url = Read-Host
$url = "http://localhost:8888/lyf/dev"
get $url