<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Money Map</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f0f8ff;
            padding: 20px;
        }
        .container {
            max-width: 600px;
            margin: 0 auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }
        h1 {
            color: #007bff;
            text-align: center;
        }
        .dollar-logo {
            font-size: 60px;
            color: green;
            text-align: center;
            margin-top: 10px;
        }
        button {
            background-color: #007bff;
            border: none;
            color: white;
            padding: 10px 20px;
            cursor: pointer;
            width: 100%;
        }
        button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="dollar-logo">
            &#36;
        </div>
        <h1>Money Map</h1>
        <form id="budget-form">
            <div class="mb-3">
                <label for="income" class="form-label">Monthly Income</label>
                <input type="number" class="form-control" id="income" required>
            </div>
            <h5>Enter Your Monthly Expenses</h5>
            <div class="mb-3">
                <label for="housing" class="form-label">Housing</label>
                <input type="number" class="form-control" id="housing" required>
            </div>
            <div class="mb-3">
                <label for="transportation" class="form-label">Transportation</label>
                <input type="number" class="form-control" id="transportation" required>
            </div>
            <div class="mb-3">
                <label for="food" class="form-label">Food</label>
                <input type="number" class="form-control" id="food" required>
            </div>
            <div class="mb-3">
                <label for="entertainment" class="form-label">Entertainment</label>
                <input type="number" class="form-control" id="entertainment" required>
            </div>
            <div class="mb-3">
                <label for="personalCare" class="form-label">Personal Care</label>
                <input type="number" class="form-control" id="personalCare" required>
            </div>
            <div class="mb-3">
                <label for="extras" class="form-label">Extras</label>
                <input type="number" class="form-control" id="extras" required>
            </div>
            <button type="submit">Generate Report</button>
        </form>
    </div>

    <script src="app.js"></script>
</body>
</html>
