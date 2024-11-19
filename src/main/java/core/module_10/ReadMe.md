# Task 1

It is given the file `"phones.txt"`" in which there is a list of phone numbers (each number in a single line).

Required to write the method which should read a file and out all valid phone numbers in console.

The phone number is valid if it matches the following patterns (x - a single number):

```
(xxx) xxx-xxxx
xxx-xxx-xxxx
```

## Example:

For the file content like:

```
987-123-4567
123 456 7890
(123) 456-7890
```

The result should be:

```
987-123-4567
(123) 456-7890
```

# Task 2

It is given the file `"users.txt"`.

It is required to read the file, convert it to the list of user objects `<User>`, and write it in a new file `"user.json"`.

## Example

For the file with the following content:

```
name age
alice 21
ryan 30
```

it is needed to create the `"user.json"`:

```
[
    {
        "name": "alice",
        "age":21
    },
    {
        "name": "ryan",
        "age":30
    }
]
```

# Task 3

Write the method which should count each word in the file `"words.txt"`.

The output to the console should be sorted by frequency (the most frequent words go first)

Precondition: the file contains only lowercase words separated by one or more spaces or line breaks.

## Example

For the content:

```
the day is sunny the the
the sunny is is
```

the result should be like following:

```
the 4
is 3
sunny 2
day 1
```
