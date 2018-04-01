sqrt_n :: Double -> Double -> Double
sqrt_n m n | (abs (n * n - m) < 0.1) = n
           | otherwise = sqrt_n m ((n+m/n)/2)
           
main :: IO()
main = do
      x <- readLn
      print (round(sqrt_n x 1))