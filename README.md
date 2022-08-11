# TA25-Spring-REST-ER
{
	"info": {
		"_postman_id": "ded66d99-7270-43dd-9ffc-6133ddbb81fb",
		"name": "Ejercicio 1 Tienda de informatica",
		"schema": "https://schema.getpostman.com/json/collection/v2.1.0/collection.json",
		"_exporter_id": "22729648"
	},
	"item": [
		{
			"name": "http://localhost:8181/api/articulos/nombre/i9_12900k",
			"request": {
				"method": "GET",
				"header": [],
				"url": {
					"raw": "http://localhost:8181/api/articulos/nombre/i9_12900k",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8181",
					"path": [
						"api",
						"articulos",
						"nombre",
						"i9_12900k"
					]
				}
			},
			"response": []
		},
		{
			"name": "http://localhost:8181/api/articulos",
			"request": {
				"method": "GET",
				"header": [],
				"url": {
					"raw": "http://localhost:8181/api/articulos",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8181",
					"path": [
						"api",
						"articulos"
					]
				}
			},
			"response": []
		},
		{
			"name": "http://localhost:8181/api/articulos",
			"request": {
				"method": "POST",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://localhost:8181/api/articulos",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8181",
					"path": [
						"api",
						"articulos"
					]
				}
			},
			"response": []
		},
		{
			"name": "http://localhost:8181/api/articulos/3",
			"request": {
				"method": "GET",
				"header": [],
				"url": {
					"raw": "http://localhost:8181/api/articulos/3",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8181",
					"path": [
						"api",
						"articulos",
						"3"
					]
				}
			},
			"response": []
		},
		{
			"name": "http://localhost:8181/api/articulos/3",
			"request": {
				"method": "PUT",
				"header": [],
				"url": {
					"raw": "http://localhost:8181/api/articulos/3",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8181",
					"path": [
						"api",
						"articulos",
						"3"
					]
				}
			},
			"response": []
		},
		{
			"name": "http://localhost:8181/api/articulos/3",
			"request": {
				"method": "DELETE",
				"header": [],
				"url": {
					"raw": "http://localhost:8181/api/articulos/3",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8181",
					"path": [
						"api",
						"articulos",
						"3"
					]
				}
			},
			"response": []
		}
	]
}
