let mfuel m = (m / 3) - 2 ;;

let rec fuel m =
  let nfuel = mfuel m in
  if nfuel <= 0 then
    0
  else
    nfuel + fuel nfuel;;

let rec read_lines chan =
  try
    let l = (input_line chan) in
    l :: (read_lines chan)
  with End_of_file ->
    [];;

let rec sum l =
  match l with
  | [] -> 0
  | head :: tail -> head + sum tail;;

let chan = open_in "input";;
print_int (read_lines chan |> List.map int_of_string |> List.map fuel |> sum);;
close_in chan;;
